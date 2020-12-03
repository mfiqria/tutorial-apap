import React from "react";

import List from "components/List/list.js";
import EmptyState from "./components/EmptyState.js";
import listMovies from "movies.json";
import './App.css';

export default class App extends React.Component{
    state = {
        favItems: [],
    };

    handleItemClickKiri = (item) => {
      // immutability
      const newItems = [ ... this.state.favItems];
      const newItem = { ... item};

      // find item index using id
      const targetInd = newItems.findIndex((it) => it.id == newItem.id);

      if (targetInd < 0) newItems.push(newItem);
      // else newItems.splice(targetInd, 1);

      // trigger set state
      this.setState({favItems: newItems});
    };

    handleItemDelete = () => {
        const newItems = [ ... this.state.favItems];
        while (newItems.length > 0){
            newItems.pop();
        }
    }

    handleItemClickKanan = (item) => {
        // immutability
        const newItems = [ ... this.state.favItems];
        const newItem = { ... item};

        // find item index using id
        const targetInd = newItems.findIndex((it) => it.id == newItem.id);

        if (targetInd < 0) newItems.push(newItem);
        else newItems.splice(targetInd, 1);

        // trigger set state
        this.setState({favItems: newItems});
    };


    handleTampilkanFavorite = () => {
        const {tampilkan} = this.state;
        this.setState({tampilkan : !tampilkan});
    };


  render() {
      const {favItems} = this.state;

    return(
        <div className="container-fluid">
            <h1 className="text-center mt-3 mb-0">Favorites Movie App</h1>
            <p className="text-center text-secondary text-sm font-italic">
                (This is a <strong>class-based</strong> application)
                <br/> <h5>Show Favorites</h5>
                <label className="switch">
                    <input type="checkbox" onChange={this.handleTampilkanFavorite}/>
                    <span className="slider"></span>
                </label>
            </p>
            <div className="container pt-3">
                <div className="row">
                    <div className="col-sm">
                        <List
                            title="List Movies"
                            items={listMovies}
                            onItemClick={this.handleItemClickKiri}
                        />
                    </div>

                    {!this.state.tampilkan ? null
                    : <div className="col-sm">
                            {!this.state.favItems.length ? <EmptyState/> :
                                <List
                                    title="My Favorites"
                                    items={favItems}
                                    onItemClick={this.handleItemClickKanan}
                                />

                            }
                            <button onClick={this.handleItemDelete}/>
                        </div>}
                </div>
            </div>
        </div>
    );
  }
}
