import axios from "axios"


export const getPaletaByName = async (name) => {

    const { data } = await axios.get(`http://localhost:8080/paletas/paletaByName?name=${name}`)

    return data;

}
