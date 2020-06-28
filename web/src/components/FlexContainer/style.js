import styled from "styled-components";

const defaultMinWidth = "300px";
const defaultMaxWidth = "900px";
const defaultPadding = "16px 0px";
const defaultBorder = "1px solid #fff";
const defaultBorderRadius = "10px";
const defaultMargin = "0px";
const defaultAlignItems = "center";
const defaultJustifyContent = "space-between";
const defaultDirection = "row";

const CustomFlexContainer = styled.div`
  display: flex;
  align-items: ${(props) => props.alignItems || defaultAlignItems};
  justify-content: ${(props) => props.justifyContent || defaultJustifyContent};
  flex-direction: ${(props) => props.direction || defaultDirection};
  min-width: ${(props) => props.minWidht || defaultMinWidth};
  max-width: ${(props) => props.maxWidht || defaultMaxWidth};
  border: ${(props) => props.border || defaultBorder};
  border-radius: ${(props) => props.borderRadius || defaultBorderRadius};
  padding: ${(props) => props.padding || defaultPadding};
  margin: ${(props) => props.margin || defaultMargin};
  background: ${(props) => props.backgroundColor || "#fff"};
`;

export default CustomFlexContainer;
