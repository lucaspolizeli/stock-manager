import React from "react";
import { Link } from "react-router-dom";
import routesPath from "../../contants/routesPath";
import HeadingContainer from "../../components/HeadingContainer";

const StockManager = () => {
  return (
    <HeadingContainer heading="Stock Manager" centerHeading>
      <p>Aqui ficarão listadas suas opções de gerenciamento. </p>
      <Link to={routesPath.Home}>Voltar para home</Link>
    </HeadingContainer>
  );
};

export default StockManager;
