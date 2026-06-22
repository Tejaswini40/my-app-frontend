import {Link} from "react-router-dom";
import './Menu.css';

function Menu(){
    return(
        <>
        <ul>
            <li><Link to="/">Home</Link></li>
            <li><Link to="/Career">Career</Link></li>
            <li><Link to="/about">About</Link></li>
        </ul>
        </>
    )
}
export default Menu;