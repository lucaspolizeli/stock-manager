import React from "react";
import CustomHeading, { CustomContainer } from "./style";
import colorPallet from "../../contants/colorPallet";

const Container = ({ heading, centerHeading, children }) => {
  return (
    // <CustomContainer maxSize={maxSize} minSize={minSize} padding={padding}>
    <CustomContainer padding="none" borderRadius="10px" margin="48px auto 0">
      {heading && (
        <CustomContainer
          padding="none"
          margin="none"
          borderRadius="10px 10px 0px 0px"
          centerHeading={centerHeading}
          backgroundColor={colorPallet.blue.high}
        >
          <CustomHeading>{heading}</CustomHeading>
        </CustomContainer>
      )}
      <CustomContainer borderRadius="0px 0px 10px 10px">
        {children}
      </CustomContainer>
    </CustomContainer>
  );
};

export default Container;
