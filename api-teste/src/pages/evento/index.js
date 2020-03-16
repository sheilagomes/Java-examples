import React, { Component } from 'react';
import api from '../../services/api';
import { Link } from 'react-router-dom';

import './styles.css';

export default class Evento extends Component {
	state = {
		eventos: {},
	};

	async componentDidMount() {
		const { id } = this.props.match.params;

        const response = await api.get(`/eventos/${id}`);

        this.setState({ eventos: response.data });
    }

    render() {
    	const { eventos } = this.state;
        
        return (
            <div className="info-eventos">
                <h1>{eventos.nome}</h1>
                <p>{eventos.capacidade}</p>
                <p>{eventos.data}</p>
                <p>{eventos.precoIngresso}</p>
	        </div>
        );
    };

}