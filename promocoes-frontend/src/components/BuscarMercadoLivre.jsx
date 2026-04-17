import React, { useState } from 'react';
import { buscarProdutosMercadoLivre } from '../services/mercadoLivreApi';

function BuscaMercadoLivre() {
  const [query, setQuery] = useState('');
  const [produtos, setProdutos] = useState(null);

  const handleBuscar = async () => {
    try {
      const resultado = await buscarProdutosMercadoLivre(query);
      setProdutos(resultado.results);
    } catch (error) {
      alert('Erro ao buscar produtos!');
    }
  };

  return (
    <div>
      <input
        type="text"
        placeholder="Buscar produto no Mercado Livre"
        value={query}
        onChange={e => setQuery(e.target.value)}
      />
      <button onClick={handleBuscar}>Buscar</button>
      {produtos && (
        <ul>
          {produtos.map(produto => (
            <li key={produto.id}>
              {produto.title} - R$ {produto.price}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default BuscaMercadoLivre;