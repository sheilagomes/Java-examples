import React from 'react';

import { BrowserRouter, Switch, Route } from 'react-router-dom';

import Main from './pages/main';
import Evento from './pages/evento';

const Routes = () => (
	<BrowserRouter>
		<Switch>
			<Route exact path='/' component={Main} />
			<Route path='/evento/:id' component={Evento} />
		</Switch>
	</BrowserRouter>
);

export default Routes;

