import { useEffect } from "react";
import CardProduto from "../components/CardProduto";
import BuscaMercadoLivre from "../components/BuscarMercadoLivre";

const ListaPromocoes = () => {

    const [produtos, setProdutos] = useState([]);
    const [loading, setLoading] = useState(true);


    useEffect(() => {
        const fetchProdutos = async () => {
            try {
                const response = await api.get('/produtos');
                setProdutos(response.data);
            } catch (err) {
                setProdutos([]);
            } finally {
                setLoading(false);
            }
        };
        
        fetchProdutos();
    }, []);



    <BuscaMercadoLivre/>

    if (loading) return <p>Carregando Promoções...</p>
    if (!produtos.length) return <p>Nenhuma Promoção encontrada.</p>


    return (
        <div style={{display: 'flex', flexWrap: 'wrap'}}>
            {produtos.map(produto => (
                <CardProduto
                    key={produto.id}
                    produto={produto}
                    onFavoritar={() => {}}
                    isFavorito={false}
                />
            ))}
        </div>
    );
};

export default ListaPromocoes;