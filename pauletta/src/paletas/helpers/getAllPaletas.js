import axios from "axios"

export const getAllPaletas = async () => {


    const { data } = await axios.get('http://localhost:8080/paletas')


    const paletas = data.map(({ id, url, name, desc, type, price }) => ({
        id,
        name,
        url,
        type,
        desc,
        price
    }));

    return paletas

}
