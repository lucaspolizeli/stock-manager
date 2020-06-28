import styled from "styled-components";

const defaultWidth = "120px";
const defaultHeight = "120px";
const defaultPadding = "8px 16px";

const CustomButton = styled.button`
  color: #2b4d66;
  cursor: pointer;
  background: #d8e2f1;
  border-radius: 10px;
  border: 1px solid #2b4d66;
  outline: unset;
  text-align: center;
  padding: ${(props) => props.padding || defaultPadding};
  width: ${(props) => props.widht || defaultWidth};
  height: ${(props) => props.height || defaultHeight};

  &:hover {
    color: #fff;
    background: #87a0b7;
  }
`;

export default CustomButton;
