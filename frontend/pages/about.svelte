<script type="ts">
    import Layout from '../common/layout.svelte'

    const names = ['kuby', 'zinna', 'hoon', 'eun']
</script>

<Layout title="hello?">
    {#each names as name }
        <p>
            name - {name}
        </p>
    {/each}
    this is about
</Layout>

<div class="heloo">
    who are u?
</div>

<style>
    .heloo {
        background: aquamarine;
    }
</style>
