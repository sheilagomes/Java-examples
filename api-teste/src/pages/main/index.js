import React, { Component } from "react";
import api from "../../services/api";
import { Link } from 'react-router-dom';

import './styles.css';

export default class Main extends Component {
	state = {
		eventos: []
	};

    componentDidMount() {
        this.loadEventos();
    }

    loadEventos = async () => {
        const response = await api.get("/eventos");

        this.setState({ eventos: response.data });
    };

    render() {
    	const { eventos } = this.state;

        return (
        	<div className="lista-eventos">
	        	{eventos.map(evento => 
	        		<article key={evento.id}>
	        			<strong>{evento.nome}</strong>
	        			<p>{evento.precoIngresso}</p>
                        <Link to={`/evento/${evento.id}`}>Acessar</Link>
	        		</article>
	        	)}
	        </div>
        );
    }
}