import { useState } from "react";


export const ComentariosPage = () => {
    const [comments, setComments] = useState([]);
    const [showModal, setShowModal] = useState(false);
    const [commentText, setCommentText] = useState('');
    const [selectedCommentIndex, setSelectedCommentIndex] = useState(null);

    const handleClose = () => {
        setShowModal(false);
        setCommentText('');
        setSelectedCommentIndex(null);
    };

    const handleShow = (index) => {
        setShowModal(true);
        setSelectedCommentIndex(index);
        setCommentText(index !== null ? comments[index] : '');
    };

    const handleSaveComment = () => {
        if (selectedCommentIndex !== null) {
            const updatedComments = [...comments];
            updatedComments[selectedCommentIndex] = commentText;
            setComments(updatedComments);
        } else {
            setComments([...comments, commentText]);
        }
        handleClose();
    };

    return (
        <div>
            <h1>Comentarios</h1>
            <ul>
                {comments.map((comment, index) => (
                    <li key={index}>{comment}</li>
                ))}
            </ul>
            <Button variant="primary" onClick={() => handleShow(null)}>Agregar Comentario</Button>

            <Modal show={showModal} onHide={handleClose}>
                <Modal.Header closeButton>
                    <Modal.Title>{selectedCommentIndex !== null ? 'Editar Comentario' : 'Agregar Comentario'}</Modal.Title>
                </Modal.Header>
                <Modal.Body>
                    <textarea value={commentText} onChange={(e) => setCommentText(e.target.value)} />
                </Modal.Body>
                <Modal.Footer>
                    <Button variant="secondary" onClick={handleClose}>Cancelar</Button>
                    <Button variant="primary" onClick={handleSaveComment}>Guardar</Button>
                </Modal.Footer>
            </Modal>
        </div>
    );
}
