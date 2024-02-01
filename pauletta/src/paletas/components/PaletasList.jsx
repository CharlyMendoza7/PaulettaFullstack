
import { useEffect, useState } from 'react';
import { getAllPaletas } from "../helpers";
import { PaletaCard } from './';

export const PaletasList = () => {


    const [paletas, setPaletas] = useState([]);

    const getPaletas = async () => {

        const p = await getAllPaletas();
        setPaletas(p);

    }

    useEffect(() => {

        getPaletas();

    }, [])

    return (
        <div className='row rows-cols-1 row-cols-md-3 g-3 ms-3 mt-3'>
            {
                paletas.map(p => (
                    <PaletaCard
                        key={p.id}
                        {...p}
                    />
                ))
            }
        </div>
    )
}

