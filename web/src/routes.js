import React from "react";
import { Route, BrowserRouter } from "react-router-dom";
import Home from "./pages/Home";
import StockManager from "./pages/StockManager";
import routesPath from "./contants/routesPath";

const Routes = () => {
  return (
    <BrowserRouter>
      <Route path={routesPath.Home} exact component={Home} />
      <Route path={routesPath.StockManager} component={StockManager} />
    </BrowserRouter>
  );
};

export default Routes;
