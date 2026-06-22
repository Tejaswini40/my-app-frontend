import React from "react";
class Stateexample extends React.Component
{
    state={
        i: 0
    }
    // test()
    // {
    //     this.setState({i: this.state.i + 1});
    // }
   // i=0;
    render(){
        return(
            <>
            {/* <p>my value is: {this.state.i}</p>
             {/* <button onClick={this.test}>Click me</button> */}
            {/* <button onClick={()=>{this.setState({i: this.state.i + 1}); console.log(this.state.i)}}>Click me</button> */} 
            </>
        );
    }}
    export default Stateexample;


    