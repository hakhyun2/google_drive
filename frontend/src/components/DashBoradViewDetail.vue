<template>

    <v-card outlined>
        <v-card-title>
            DashBorad # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="FileName" v-model="item.fileName" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="FileSize" v-model="item.fileSize" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="FileType" v-model="item.fileType" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="IndexYn" v-model="item.indexYn" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Boolean label="UploadYn" v-model="item.uploadYn" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="VideoFileUrl" v-model="item.videoFileUrl" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'DashBoradViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/dashBorads/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

