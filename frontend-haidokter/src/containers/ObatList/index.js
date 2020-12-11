import React, { Component } from "react";
import Obat from "../../components/Obat";

class ObatList extends Component {
    render() {
        const {listObat} = this.props;
        return (
            <div>
                {listObat.map((obat) => (
                    <Obat
                        key={obat.id}
                        id = {obat.id}
                        nama={obat.nama}
                        kuantitas={obat.kuantitas}
                    />
                ))}
            </div>
        );
    }
}

export default ObatList;