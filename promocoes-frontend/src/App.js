import { useState } from 'react';
import BotaoFavoritar from './components/BotaoFavoritar';

function App() {
  const [favorito, setFavorito] = useState(false);

  return (
    <div>
      <h1>Teste Botão Favoritar</h1>
      <BotaoFavoritar
        isFavorito={favorito}
        onClick={() => setFavorito(f => !f)}
      />
    </div>
  );
}

export default App;
