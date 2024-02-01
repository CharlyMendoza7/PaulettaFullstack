import axios from "axios"


export const getPaletaById = async (id) => {

    const { data } = await axios.get(`http://localhost:8080/paletas/paletaById?id=${id}`);

    console.log(data)


}
