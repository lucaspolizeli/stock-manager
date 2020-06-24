import React from "react";
import { Link } from "react-router-dom";
import routesPath from "../../contants/routesPath";

const StockManager = () => {
  return (
    <div>
      <h1>Stock Manager</h1>
      <Link to={routesPath.Home}>Voltar para home</Link>
    </div>
  );
};

export default StockManager;
