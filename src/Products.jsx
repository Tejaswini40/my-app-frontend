import { useEffect, useState } from "react";
import axios from "axios";
import List from "./List";
import InstituteForm from "./InstituteForm";

function Products() {

    const [products, updateProducts] = useState([]);
    const [faculty, setFaculty] = useState("");
    const [name, setName] = useState("");
    const [location, setLocation] = useState("");
    const [fee, setFee] = useState("");

    useEffect(() => {
        getProducts();
    }, []);

    async function getProducts() {
        try {

            let result = await axios.get(
                "http://localhost:8080/institutes/findAll"
            );

            console.log(result.data);

            updateProducts(result.data);

        } catch (error) {
            console.log(error);
        }
    }

    if (products.length === 0) {
        return (
            <>
                <div className="spinner-border" role="status">
                    <span className="visually-hidden">
                        Loading...
                    </span>
                </div>
            </>
        );
    }

    return (
        <>
            {
                products.map((product) => (
                    <List key={product.id} {...product}/>
                ))
            }
        </>
    );
}

export default Products;