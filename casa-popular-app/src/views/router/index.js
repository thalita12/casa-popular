import Vue from 'vue'
import VueRouter from 'vue-router'
import Cadastro from '../pages/cadastro/Cadastro'
import Contemplados from '../pages/contemplados/Contemplados'
import FamiliasAptas from '../pages/familias-aptas/FamiliasAptas'
import PaginaNaoEncontrada from '../pages/pagina-nao-encontrada/PaginaNaoEncontrada'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'FamiliasAptas',
    component: FamiliasAptas
  },
  {
    path: '/cadastro',
    name: 'Cadastro',
    component: Cadastro
  },
  {
    path: '/contemplados',
    name: 'Contemplados',
    component: Contemplados
  },
  {
    path: '/*',
    name: '404',
    component: PaginaNaoEncontrada
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
