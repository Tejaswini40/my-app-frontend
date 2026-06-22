import { useState } from "react";
import axios from "axios";

function InstituteForm() {

    const [faculty, setFaculty] = useState("");
    const [name, setName] = useState("");
    const [location, setLocation] = useState("");
    const [fee, setFee] = useState("");

    async function saveInstitute() {

        try {

            const response = await axios.post(
                "http://localhost:8080/institutes",
                {
                    faculty,
                    name,
                    location,
                    fee
                }
            );

            console.log(response.data);

            alert("Data Added Successfully");

            // clear form
            setFaculty("");
            setName("");
            setLocation("");
            setFee("");

        } catch (error) {

            console.log(error);

            alert("POST Failed");

        }
    }

    return (
        <>

            <h3>Post Institute</h3>

            <div>

                <input
                    type="text"
                    placeholder="Faculty"
                    value={faculty}
                    onChange={(e) =>
                        setFaculty(e.target.value)
                    }
                />

                <br /><br />

                <input
                    type="text"
                    placeholder="Name"
                    value={name}
                    onChange={(e) =>
                        setName(e.target.value)
                    }
                />

                <br /><br />

                <input
                    type="text"
                    placeholder="Location"
                    value={location}
                    onChange={(e) =>
                        setLocation(e.target.value)
                    }
                />

                <br /><br />

                <input
                    type="number"
                    placeholder="Fee"
                    value={fee}
                    onChange={(e) =>
                        setFee(e.target.value)
                    }
                />

                <br /><br />

                <button onClick={saveInstitute}>
                    Save
                </button>

            </div>

        </>
    );
}

export default InstituteForm;