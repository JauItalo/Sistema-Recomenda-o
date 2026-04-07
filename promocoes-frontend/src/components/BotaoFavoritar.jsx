import '../css/BotaoFavoritar.css';

const BotaoFavoritar = ({ onClick, isFavorito }) => (
    <button
        className={`botao-favoritar ${isFavorito ? 'favorito' : ''}`}
        onClick={onClick}
        aria-label={isFavorito ? 'Desfavoritar' : 'Favoritar'}
    >
        {isFavorito ? '❤️' : '🤍'}    
    </button> 
);

export default BotaoFavoritar;