import { Route, BrowserRouter as Router, Routes } from 'react-router-dom';
import Cadastro from './pages/Cadastro';
import DetalheProduto from './pages/DetalheProduto';
import Favoritos from './pages/Favoritos';
import ListaPromocoes from './pages/ListaPromocoes';
import Login from './pages/Login';

import PrivateRoute from './components/PrivateRoute';
import { useAuth } from './hooks/useAuth';

function App() {
  const auth = useAuth();
  return (
    <Router>
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/cadastro" element={<Cadastro />} />

        <Route
          path="/promocoes"
          element={
            <PrivateRoute isAuthenticated={auth.isAuthenticated}>
              <ListaPromocoes />
            </PrivateRoute>
          }
        />

        <Route
        path="/favoritos"
        element={
          <PrivateRoute isAuthenticated={auth.isAuthenticated}>
            <Favoritos />
          </PrivateRoute>
          }
        />

        <Route 
        path="/produto/:id" 
        element={
          <PrivateRoute isAuthenticated={auth.isAuthenticated}>
            <DetalheProduto/>
          </PrivateRoute>
        }
        />
        
        <Route path="*" element={<Login />} />
      </Routes>
    </Router>
  );
}

export default App;