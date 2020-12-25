import React from "react";

const Obat = (props) => {
    const { id, nama, bentuk, kuantitas } = props;
    return (
        <div>
            <b>{`${nama}`} ({`${kuantitas}`})</b>
        </div>
    );
};

export default Obat;