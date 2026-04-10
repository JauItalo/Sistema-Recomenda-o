import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { useAuth } from "../hooks/useAuth";
import { login } from "../services/auth";




const Login = () => {
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [erro, setErro] = useState('');
    const navigate = useNavigate();
    const auth = useAuth();


    const handleSubmit = async (e) => {
        e.preventDefault();

        try {
            const data = await login(email, password);
            auth.login(data.token);
            navigate('/promocoes');
        } catch (err) {
            setErro('Email ou senha inválidos');
        }
    };
 
    return (
        <div>
            <h2>Login</h2>
            <form onSubmit={handleSubmit}>
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
                <button type="submit">Entrar</button>
            </form>
            {erro && <p style={{color: 'red' }}>{erro}</p>}
        </div>
    );
};
export default Login;