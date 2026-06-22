import Home from './Home'
import About from './About'
import Menu from './Menu'
import Slider from './Slider'
import Career from './Career'
import Page from './Page'
import Teju from './Teju'
import Products from './Products'
import Usestate from './Usestate'
import InstituteForm from './InstituteForm'
import { useState } from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Stateexample from './Stateexample'
import list from './List';

function App() 
{
    const [openForm, setOpenForm] = useState(false);

function showForm() {
  setOpenForm(true);
}
  return (
    <>
    <Stateexample/>
      <BrowserRouter>
      <div className="wrapper m-5 w-50 ">
        <h2 className='text-start text-primary'> CRUD operations using react js </h2>
        <button className='btn btn-primary float-end' onClick={() => {showForm()}}> POST</button>
        <br /><br />

{
  openForm && <InstituteForm />
}

<br />

<Products />
      </div>

        {/* <Menu />
        <Slider /> */}

        <Routes>
          <Route path='/home' element={<Home />} />
          <Route path='/edit/:id' element={<About />} />
          <Route path='/about' element={<About />} />
          <Route path='/teju' element={<Teju />} />
          <Route path='/career' element={<Career />} />
          <Route path='/Usestate' element={<Usestate />} />
          <Route path='/products' element={<Products />} />
          <Route path='*' element={<Page />} />
          
        </Routes>

      </BrowserRouter>
    </>
  )
};

export default App