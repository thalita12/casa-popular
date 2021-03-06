import Vue from 'vue'
import App from './App.vue'
import router from './views/router'
import store from './core/store'
import vuetify from '@/plugins/vuetify'

Vue.config.productionTip = false

new Vue({
  router,
  store,
  vuetify,
  render: h => h(App)
}).$mount('#app')
