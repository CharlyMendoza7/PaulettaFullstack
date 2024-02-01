import { Navigate, Route, Routes } from "react-router-dom";

import { Navbar } from "../ui";

import { HomePage, NosotrosPage, FAQPage, ComentariosPage, ContactoPage } from "../paletas";
import { PaletaPage } from "../paletas/components";


export const AppRouter = () => {
    return (
        <>
            <Navbar />
            <Routes>
                <Route path="home" element={<HomePage />} />
                <Route path="nosotros" element={<NosotrosPage />} />
                <Route path="faq" element={<FAQPage />} />
                <Route path="comentarios" element={<ComentariosPage />} />
                <Route path="contacto" element={<ContactoPage />} />
                <Route path="/:name" element={<PaletaPage />} />
                <Route path="/*" element={<Navigate to="/home" />} />

            </Routes>
        </>
    )
}
