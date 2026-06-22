
import axios from "axios";

function List({id,faculty, name, location, fee}) {


   async function deleteItem() {
    
          let respone =   await axios.delete(`http://localhost:8080/institutes/id/${id}`);
          console.log(respone.data);
        
        
    } 
    async function GetItem() {
    
          let respone =   await axios.get(`http://localhost:8080/institutes/id/${id}`);
          console.log(respone.data);
    }
    // async function PostItem() {
    
    //       let respone =   await axios.post(`http://localhost:8080/institutes/id/${id}`);
    //       console.log(respone.data);
    // }

    return (
        <>
        <h3>Institute Details</h3>
            id:{id} <br/>
            faculty:{faculty} <br/>
            name:{name} <br/>
            location:{location} <br/>
            fee:{fee} <br/><br/>    
            <button onClick={deleteItem}> Delete  </button>
            <button onClick={GetItem}> Get</button>
            {/* <button onClick={PostItem}> Post</button> */}
            {/* <img src={image} width={150}
height={150}/>
            <br/>
            {price} <br/>
            {rating.rate} <br/><br/> */}
            <hr/>
        </>
    )
}

export default List;