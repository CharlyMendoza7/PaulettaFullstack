
import { useEffect, useState } from 'react';
import { Navigate, useNavigate, useParams } from 'react-router-dom';
import { getPaletaByName } from '../helpers/getPaletaByName';
import { HomePage } from '../pages';

export const PaletaPage = () => {

    const [paleta, setPaleta] = useState('')

    const { name } = useParams();

    const navigate = useNavigate();

    const navigateBack = () => {

        navigate(-1);

    }

    const getPaletaByInfo = async () => {

        const paletaInfo = await getPaletaByName(name);
        setPaleta(paletaInfo)
        checkRedirect(paletaInfo);

    }

    const checkRedirect = (paletaInfo) => {
        if (paletaInfo === '') {
            window.location.replace('http://localhost:5173/Home');
        }
    }

    useEffect(() => {
        getPaletaByInfo();
    }, [])



    return (
        <div className='row mt-5 ms-5'>
            <div className='col-4'>
                <img
                    src={paleta.url}
                    alt={paleta.name}
                    className='img-thumbnail'
                />

            </div>
            <div className="col-3">
                <ul className='list-group list-group-flush'>
                    <li className='list-group-item'><b>tipo:</b> {paleta.type}</li>
                    <li className='list-group-item'>{paleta.desc}</li>
                </ul>

                <button className='btn btn-outline-primary' onClick={navigateBack}>
                    Regresar
                </button>
            </div>
        </div>
    )
}
