import React, { Component } from "react";
import api from "../../services/api";

export default class Main extends Component {
	state = {
		eventos: []
	};

    componentDidMount() {
        this.loadProducts();
    }

    loadProducts = async () => {
        const response = await api.get("/eventos");

        this.setState({ eventos: response.data.docs });
    };

    render() {
        // return <h1>Contagem de eventos: {this.state.eventos.length}</h1>;
        return (
        	<div className="lista-eventos">
	        	{this.state.eventos.map(evento => (
	        		<h2>{evento.nome}</h2>
	        	))}
	        </div>
        );
    }
}