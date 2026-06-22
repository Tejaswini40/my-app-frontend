import { useState } from "react";
function Usestate()
{
    useEffect(()=>{
        console.log('useeffect called');

    });
    let [i, updatevalue]=useState('teju');//array vastundi, 0th index lo current value untadi, 1st index lo call back function untadi, 
    // a function ni call chesi manam value update cheyyali array destructuring
    
    //let data=useState('teju');
//     console.log(data);
// var i=0;
function test()
{
    i++;
   // console.log(i);
    updatevalue(i);
}
function test1()
{
    j++;
    updatevalue('j');
}
return(
    <>
    <p>Usestate component</p>
    <p>My i value is: {i}</p>
    <button onClick={test}>Click me</button>
    </>
);
}
export default Usestate;