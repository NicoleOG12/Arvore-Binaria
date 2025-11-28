<h1>🌳 Projeto: Árvore Binária de Busca (BST) – 7 Níveis</h1>

<p>Este projeto implementa uma <strong>Árvore Binária de Busca (BST)</strong> em <strong>Java</strong>, incluindo operações de inserção, percursos, cálculo de altura, contagem de nós/folhas e impressão por níveis (BFS).<br>
Foram criados três cenários de inserção (A, B e C) para analisar o comportamento estrutural da árvore.</p>

<h2>⚙️ Como compilar e executar</h2>

<h3>🔧 Linux / Mac / WSL</h3>
<pre>
javac *.java
java Main
</pre>

<h3>🪟 Windows (CMD / PowerShell)</h3>
<pre>
javac *.java
java Main
</pre>

<p>⚠️ Certifique-se de que <code>No.java</code>, <code>ArvoreBinariaBusca.java</code> e <code>Main.java</code> estão na mesma pasta.</p>

<h2>📁 Estrutura do Projeto</h2>
<pre>
Arvore-Binaria
├── bin/                
├── lib/                
├── src/                
│   ├── No.java
│   ├── ArvoreBinariaBusca.java
│   └── Main.java
└── README.md
</pre>
</pre>

<h2>🧪 Cenários de Inserção</h2>
<p>O trabalho exige a construção de 3 árvores diferentes variando apenas a ordem de inserção. A seguir estão as sequências utilizadas exatamente como no código.</p>

<h3>🔵 Cenário A – Degenerada à direita (inserção crescente)</h3>
<pre>
10, 20, 30, 40, 50, 60, 70
</pre>

<h3>🔴 Cenário B – Degenerada à esquerda (inserção decrescente)</h3>
<pre>
70, 60, 50, 40, 30, 20, 10
</pre>

<h3>🟢 Cenário C – Quase balanceada com ramo profundo</h3>
<p>Base balanceada:</p>
<pre>
50, 30, 70, 20, 40, 60, 80,
10, 25, 35, 45, 55, 65, 75, 85
</pre>

<p>Inserções adicionais para criar um ramo profundo:</p>
<pre>
90, 95, 97, 98, 99
</pre>

<h2>📌 Funcionalidades implementadas</h2>
<ul>
    <li>Inserção de elementos</li>
    <li>Percursos:
        <ul>
            <li>Pré-ordem</li>
            <li>Em-ordem</li>
            <li>Pós-ordem</li>
            <li>BFS (por níveis)</li>
        </ul>
    </li>
    <li>Contagem:
        <ul>
            <li>Total de nós</li>
            <li>Total de folhas</li>
        </ul>
    </li>
    <li>Cálculo da altura</li>
    <li>Impressão estruturada dos níveis</li>
</ul>

<h2>📘 Observações</h2>
<p>Este projeto foi desenvolvido para a disciplina de Estrutura de Dados.<br>
O objetivo principal é analisar como diferentes sequências de inserção influenciam a estrutura da árvore.<br>
Nenhum balanceamento automático (AVL, Rubro-Negra etc.) foi utilizado.</p>
