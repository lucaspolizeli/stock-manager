import React from "react";
import CustomButton from "./style";

const Button = ({ height, widht, padding, children }) => {
  return (
    <CustomButton padding={padding} height={height} widht={widht}>
      {children}
    </CustomButton>
  );
};

export default Button;
