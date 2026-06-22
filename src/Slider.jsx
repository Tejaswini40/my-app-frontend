// eslint-disable-next-line no-unused-vars
import React from "react";
import { Carousel } from "react-bootstrap";

function Slider() {
  return (
    <Carousel>
      <Carousel.Item>
        <img
          className="d-block w-100"
          src="pspk1.webp"
          alt="First slide"
        />

        <Carousel.Caption>
          <h3>First Slide</h3>
          <p>PSPKt</p>
        </Carousel.Caption>
      </Carousel.Item>

      <Carousel.Item>
        <img
          className="d-block w-100"
          src="pspk2.webp"
          alt="Second slide"
        />

        <Carousel.Caption>
          <h3>Second Slide</h3>
          <p>PSPK</p>
        </Carousel.Caption>
      </Carousel.Item>

      <Carousel.Item>
        <img
          className="d-block w-100"
          src="pspk3.webp"
          alt="Third slide"
        />

        <Carousel.Caption>
          <h3>Third Slide</h3>
          <p>PSPK</p>
        </Carousel.Caption>
      </Carousel.Item>
    </Carousel>
  );
}

export default Slider;