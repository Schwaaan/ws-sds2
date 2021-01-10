
type Props = {
    message: string;
}

function Hello({message} : Props) {
    return (
        <h1>Componet {message}</h1>
    )
}

export default Hello;