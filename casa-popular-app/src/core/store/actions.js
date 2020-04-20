import axios from 'axios'
import {actionTypes} from '@/core/constants'

export default {

    async [actionTypes.BUSCAR_FAMILIAS_APTAS]() {
        const {data} = await axios.get(`/api/familias-aptas`)
        return data
    },

    async [actionTypes.BUSCAR_FAMILIAS_CONTEMPLADAS]() {
        const {data} = await axios.get(`/api/familias-contempladas`)
        return data
    }

}
