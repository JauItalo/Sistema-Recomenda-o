import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import Cadastro from './pages/Cadastro';
import DetalheProduto from './pages/DetalheProduto';
import Favoritos from './pages/Favoritos';
import ListaPromocoes from './pages/ListaPromocoes';
import Login from './pages/Login';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/cadastro" element={<Cadastro />} />
        <Route path="/promocoes" element={<ListaPromocoes />} />
        <Route path="/favoritos" element={<Favoritos />} />
        <Route path="/produto/:id" element={<DetalheProduto />} />
        <Route path="*" element={<Login />} />
      </Routes>
    </Router>
  );
}

export default App;