import React from "react";
import { Link } from "react-router-dom";

export const PaletaCard = ({ id, name, url, type, descrip, price }) => {
  return (
    <div className="col">
      <div className="card">
        <div className="row no-gutters">
          <div className="col-4">
            <img src={url} className="card-img" alt={name} />
          </div>
          <div className="col-8">
            <div className="card-body">
              <h5 className="card-title">{name}</h5>
              <p className="card-text">{type}</p>
              <p className="card-text line-clamp-4">{descrip}</p>
              <Link to={`/${name}`}>Más...</Link>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};
