import React from "react";
import BotaoFavoritar from "./BotaoFavoritar";


const CardProduto = ({ produto, onFavoritar, isFavorito}) => (
    <div className="card-produto">
        <img src={produto.image} alt={produto.name} className="card-produto_imagem" />
        <div className="card-produto_info">
            <h3>{produto.name}</h3>
            <p>Preço: R${produto.price}</p>
            <BotaoFavoritar onClick={() => onFavoritar(produto)} isFavorito={isFavorito} />
        </div>
    </div>
);

export default CardProduto;