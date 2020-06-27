import React from "react";
import CustomFlexContainer from "./style";

const FlexContainer = ({
  alignItems,
  justifyContent,
  minWidht,
  maxWidht,
  border,
  borderRadius,
  padding,
  margin,
  backgroundColor,
  children,
}) => {
  const containerProps = {
    alignItems,
    justifyContent,
    minWidht,
    maxWidht,
    border,
    borderRadius,
    padding,
    margin,
    backgroundColor,
  };

  return (
    <CustomFlexContainer {...containerProps}>{children}</CustomFlexContainer>
  );
};

export default FlexContainer;
