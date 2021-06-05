import styled from "styled-components";
import colorPallet from "../../contants/colorPallet";

const defaultMinWidth = "300px";
const defaultMaxWidth = "900px";
const defaultPadding = "16px 32px";
const defaultHeadingFontSize = "48px";
const defaultBorderRadius = "10px";
const defaultMargin = "8px";
const defaultTextAlign = "left";

const CustomHeading = styled.h1`
  color: #fff;
  margin: 0px;
  min-width: ${(props) => props.minWidht || defaultMinWidth};
  max-width: ${(props) => props.maxWidht || defaultMaxWidth};
  padding: ${(props) => props.padding || defaultPadding};
  font-size: ${(props) => props.fontSize || defaultHeadingFontSize};
`;
export default CustomHeading;

export const CustomContainer = styled.div`
  text-align: ${(props) => (props.centerHeading ? "center" : defaultTextAlign)};
  min-width: ${(props) => props.minWidht || defaultMinWidth};
  max-width: ${(props) => props.maxWidht || defaultMaxWidth};
  border-radius: ${(props) => props.borderRadius || defaultBorderRadius};
  padding: ${(props) => props.padding || defaultPadding};
  margin: ${(props) => props.margin || defaultMargin};
  background: ${(props) => props.backgroundColor || colorPallet.blue.lighter};
`;
