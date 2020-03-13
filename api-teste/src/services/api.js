import axios from "axios";

const api = axios.create({ baseURL: "https://api-gerenciador-de-eventos.herokuapp.com/api })" });

export default api;