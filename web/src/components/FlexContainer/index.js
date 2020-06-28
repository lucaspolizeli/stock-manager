import React from "react";
import CustomFlexContainer from "./style";

const FlexContainer = ({
  alignItems,
  justifyContent,
  direction,
  minWidht,
  maxWidht,
  borderRadius,
  border = "none",
  margin = "none",
  padding = "none",
  backgroundColor = "transparent",
  children,
}) => {
  return (
    <CustomFlexContainer
      alignItems={alignItems}
      justifyContent={justifyContent}
      direction={direction}
      minWidht={minWidht}
      maxWidht={maxWidht}
      border={border}
      borderRadius={borderRadius}
      padding={padding}
      margin={margin}
      backgroundColor={backgroundColor}
    >
      {children}
    </CustomFlexContainer>
  );
};

export default FlexContainer;
