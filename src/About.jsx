// import React from "react";
// import { useParams } from "react-router-dom";
//import teju from "./Teju";
// class About extends React.Component{
//     // constructor(props){
//     //     // super(props);
//     //     // this.props=props   
//     // }
//     render(){
//     return(
//     <>
//     <p>This is About Component</p>
//     {this.props.name} <br/>
//     {this.props.course}
//     </>
//     );
// }
// }
// export default About;
import Usestate from "./Usestate";
import React from "react";
import { useParams } from "react-router-dom";

function About() {

  const { id } = useParams(1);

  const queryParams = new URLSearchParams(window.location.search);

  const name = queryParams.get('Teju');

  console.log(name);

  return (
    <>
      <h1>Welcome to About Page</h1>

      <p>The ID is: 1{id}</p>

      <p>Name is: Teju{name}</p>
    </>
  );
}

export default About;