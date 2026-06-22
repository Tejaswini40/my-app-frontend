import React from "react";

function Calculator() {

  const add = () => {
    let num1 = Number(document.getElementById("num1").value);
    let num2 = Number(document.getElementById("num2").value);

    document.getElementById("result").innerHTML = num1 + num2;
  };

  const subtract = () => {
    let num1 = Number(document.getElementById("num1").value);
    let num2 = Number(document.getElementById("num2").value);

    document.getElementById("result").innerHTML = num1 - num2;
  };

  const multiply = () => {
    let num1 = Number(document.getElementById("num1").value);
    let num2 = Number(document.getElementById("num2").value);

    document.getElementById("result").innerHTML = num1 * num2;
  };

  const divide = () => {
    let num1 = Number(document.getElementById("num1").value);
    let num2 = Number(document.getElementById("num2").value);

    if (num2 === 0) {
      document.getElementById("result").innerHTML =
        "Cannot divide by zero";
    } else {
      document.getElementById("result").innerHTML = num1 / num2;
    }
  };

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h2>Calculator</h2>

      <input
        type="text"
        id="num1"
        placeholder="Enter first number"
      />

      <br /><br />

      <input
        type="text"
        id="num2"
        placeholder="Enter second number"
      />

      <br /><br />

      <button onClick={add}>+</button>

      <button onClick={subtract} style={{ marginLeft: "10px" }}>
        -
      </button>

      <button onClick={multiply} style={{ marginLeft: "10px" }}>
        *
      </button>

      <button onClick={divide} style={{ marginLeft: "10px" }}>
        /
      </button>

      <h3>
        Result: <span id="result"></span>
      </h3>
    </div>
  );
}

export default Calculator;