import { useState } from "react";
import { useNavigate } from "react-router-dom";

const Cadastro = () => {

    const [name, setName] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [erro, setErro] = useState('');
    const navigate = useNavigate();


    const handleSubmit = async (e) => {
        e.preventDefault();
        try{
            await register(name, email, password);
            navigate('/login');
        } catch (err) {
            setErro('Erro ao tentar cadastrar. Verifique os dados e tente novamente.');
        }
    };



    return (
        <div>
            <h2>Cadastro</h2>
            <form onSubmit={handleSubmit}>
                <input 
                    type="text"
                    placeholder="Nome"
                    value={name}
                    onChange={e => setName(e.target.value)}
                    required
                />
                <input 
                    type="email"
                    placeholder="E-mail"
                    value={email}
                    onChange={e => setEmail(e.target.value)}
                    required
                />
                <input 
                    type="password"
                    placeholder="Senha"
                    value={password}
                    onChange={e => setPassword(e.target.value)}
                    required
                />

                <button type="submit">Cadastrar</button>
            </form>
            {erro && <p style={{color: 'red'}}>{erro}</p>}
        </div>
    );
};

export default Cadastro;