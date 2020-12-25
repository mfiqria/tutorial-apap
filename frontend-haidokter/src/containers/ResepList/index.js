import React, { Component } from "react";
import Resep from "../../components/Resep";
import classes from "./styles.module.css";
import APIConfig from "../../api/APIConfig";
import Button from "../../components/Button";
import Modal from "../../components/Modal";
import Obat from "../../components/Obat";


class ResepList extends Component{
    constructor(props) {
        super(props);
        this.state = {
            reseps : [],
            isLoading : false,
            isCreate: false,
            isEdit: false,
            namaDokter: "",
            namaPasien: "",
            catatan: "",
            search: "",
        };
        this.handleClickLoading = this.handleClickLoading.bind(this);
        this.handleAddResep = this.handleAddResep.bind(this);
        this.handleCancel = this.handleCancel.bind(this);
        this.handleChangeField = this.handleChangeField.bind(this);
        this.handleEditResep = this.handleEditResep.bind(this);
        this.handleSubmitAddResep = this.handleSubmitAddResep.bind(this);
        this.handleSubmitEditResep = this.handleSubmitEditResep.bind(this);
        this.handleDeleteResep = this.handleDeleteResep.bind(this);
    }

    componentDidMount(){
        this.loadData();
    }

    async loadData(){
        try{
            const{data} = await APIConfig.get("/reseps");
            this.setState({reseps:data});
        } catch (error){
            alert("Oops terjadi masalah pada server");
            console.log(error);
        }
    }

    async handleSubmitAddResep(event){
        event.preventDefault();
        try{
            const data = {
                namaDokter: this.state.namaDokter,
                namaPasien: this.state.namaPasien,
                catatan: this.state.catatan,
            };
            await APIConfig.post("/resep", data);
            this.loadData();
        } catch(error){
            alert("Oops terjadi masalah pada server");
            console.log(error);
        }
        this.handleCancel(event);
    }

    async handleSubmitEditResep(event){
        event.preventDefault();
        try{
            const data = {
                namaDokter: this.state.namaDokter,
                namaPasien: this.state.namaPasien,
                catatan: this.state.catatan,
            };
            await APIConfig.put(`/resep/${this.state.noResep}`, data);
            this.loadData();
        } catch(error){
            alert("Oops terjadi masalah pada server");
            console.log(error);
        }
        this.handleCancel(event);
    }

    async handleDeleteResep(noResep){
        // console.log("Yak MAsuk");
        try{
            await APIConfig.delete(`/resep/${noResep}`);
            this.loadData();
        } catch(error){
            alert("Oops terjadi masalah pada server");
            console.log(error);
        }
    }

    handleAddResep(){
        this.setState({
            isCreate:true,
            namaDokter:"",
            namaPasien:"",
            catatan:""});
    }

    handleEditResep(resep){
        this.setState({
            isEdit:true,
            noResep: resep.noResep,
            namaDokter: resep.namaDokter,
            namaPasien: resep.namaPasien,
            catatan: resep.catatan,
        });
    }

    shouldComponentUpdate(nextProps, nextState) {
        console.log("shouldComponentUpdate()");
        return true;
    }

    handleClickLoading() {
        const currentLoading = this.state.isLoading;
        this.setState({ isLoading: !currentLoading });
        console.log(this.state.isLoading);
    }

    handleCancel(event){
        event.preventDefault();
        this.setState({isCreate:false, isEdit:false});
    }

    handleChangeField(event){
        const {name, value} = event.target;
        this.setState({[name]: value});
    }

    filterSearch(event) {
        this.setState({search: event.target.value.substr(0,50)});
    }

    render(){
        let filterReseps = this.state.reseps.filter(
            (resep) => {
                return resep.namaDokter.toLowerCase().indexOf(this.state.search.toLowerCase()) !== -1;
            }
        );
        return(
            <div className={classes.resepList}>
                <h1 className={classes.title}>All Reseps</h1>
                <div>
                    <input type="text"
                           className={classes.search}
                           placeholder="Search Resep"
                           value={this.state.search}
                           onChange={this.filterSearch.bind(this)}
                    />
                </div>
                <br/>
                <Button onClick={this.handleAddResep} variant="primary">
                    Add Resep
                </Button>
                <div>
                    {filterReseps.map((resep)=>(
                        <Resep
                            key = {resep.noResep}
                            noResep={resep.noResep}
                            namaDokter={resep.namaDokter}
                            namaPasien={resep.namaPasien}
                            catatan={resep.catatan}
                            // listObat= {resep.listObat.length === 0 ? "Resep tidak memiliki obat" : resep.listObat}
                            listObat= {resep.listObat}
                            handleEdit={()=> this.handleEditResep(resep)}
                            handleDelete={()=> this.handleDeleteResep(resep.noResep)}
                        />
                    ))}
                </div>
                <Modal show={this.state.isCreate || this.state.isEdit}
                       handleCloseModal={this.handleCancel}>
                    <form>
                        <h3 className={classes.modalTitle}>
                            {this.state.isCreate ?
                                "Add Resep"
                                : `Edit Resep Nomor ${this.state.noResep}`}
                        </h3>
                        <input
                            className={classes.textField}
                            type="text"
                            placeholder="Nama Dokter"
                            name="namaDokter"
                            value={this.state.namaDokter}
                            onChange={this.handleChangeField}
                        />
                        <input
                            className={classes.textField}
                            type="text"
                            placeholder="Nama Pasien"
                            name="namaPasien"
                            value={this.state.namaPasien}
                            onChange={this.handleChangeField}
                        />
                        <textarea
                            className={classes.textField}
                            placeholder="Catatan"
                            name="catatan"
                            rows="4"
                            value={this.state.catatan}
                            onChange={this.handleChangeField}
                        />
                        <Button onClick = {
                            this.state.isCreate ?
                                this.handleSubmitAddResep
                                : this.handleSubmitEditResep
                        } variant = "primary"
                        >
                            {this.state.isCreate ? "Create" : "Edit"}
                        </Button>
                        <Button onClick = {this.handleCancel} variant = "danger">
                            Cancel
                        </Button>
                    </form>
                </Modal>
            </div>
        );
    }
}

export default ResepList;

