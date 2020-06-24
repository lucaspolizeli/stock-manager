import React from "react";
import { Link } from "react-router-dom";
import routesPath from "../../contants/routesPath";

const Home = () => {
  return (
    <div id="home">
      <h1>Home</h1>
      <Link to={routesPath.StockManager}>
        Clique aqui para gerenciar o seu estoque
      </Link>
    </div>
  );
};

export default Home;
