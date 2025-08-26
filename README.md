<!DOCTYPE html>
<html lang="en">
<head>
  Basic Employee Shift Manager 
  <style>
    :root {
      --bg: #0b1220;
      --card: #11182a;
      --text: #e9edf1;
      --muted: #a9b3c1;
      --accent: #6ee7b7;
      --accent-2: #60a5fa;
      --border: #1e293b;
    }

    * { box-sizing: border-box; }
    html, body { margin: 0; padding: 0; }
    body {
      font-family: system-ui, -apple-system, Segoe UI, Roboto, Helvetica, Arial, "Apple Color Emoji", "Segoe UI Emoji";
      color: var(--text);
      background: radial-gradient(1200px 600px at 20% -10%, #1a2540, transparent),
                  radial-gradient(1200px 600px at 120% 10%, #10223a, transparent),
                  var(--bg);
      line-height: 1.65;
      -webkit-font-smoothing: antialiased;
      -moz-osx-font-smoothing: grayscale;
    }
    a { color: var(--accent-2); text-decoration: none; }
    a:hover { text-decoration: underline; }

    .container {
      max-width: 980px;
      margin: 0 auto;
      padding: 2rem 1rem 4rem;
    }

    header.hero {
      background: linear-gradient(180deg, rgba(255,255,255,0.06), rgba(255,255,255,0));
      border: 1px solid var(--border);
      box-shadow: 0 10px 40px rgba(0,0,0,.35);
      border-radius: 18px;
      padding: 2rem;
    }

    .title {
      font-size: clamp(1.8rem, 4vw, 2.6rem);
      margin: 0 0 .5rem;
      letter-spacing: .3px;
    }
    .subtitle { color: var(--muted); margin: 0 0 1rem; }

    .badges { display: flex; gap: .6rem; flex-wrap: wrap; margin-top: .75rem; }
    .badge {
      font-size: .8rem; color: #0b1220; background: var(--accent);
      padding: .25rem .6rem; border-radius: 999px; border: 1px solid #82f3c9;
      font-weight: 600;
    }

    nav.toc { margin: 2rem 0 1.5rem; }
    nav.toc a { color: var(--muted); margin-right: 1rem; }

    section.card {
      background: var(--card);
      border: 1px solid var(--border);
      border-radius: 16px;
      padding: 1.25rem 1.25rem 1rem;
      margin: 1rem 0 1.25rem;
    }

    h2 { font-size: 1.35rem; margin-top: 0; }
    h3 { font-size: 1.05rem; margin-bottom: .3rem; }

    ul { margin: .5rem 0 0 1.25rem; }
    li { margin: .35rem 0; }
    code, pre { font-family: ui-monospace, SFMono-Regular, Menlo, Monaco, Consolas, "Liberation Mono", monospace; }
    code { background: #0c1323; padding: .15rem .35rem; border-radius: 6px; border: 1px solid #141d35; }

    pre {
      background: #0c1323;
      border: 1px solid #141d35;
      padding: 1rem;
      border-radius: 12px;
      overflow: auto;
    }

    .grid {
      display: grid; gap: .9rem;
      grid-template-columns: repeat(auto-fit, minmax(260px, 1fr));
    }

    .hint { color: var(--muted); font-size: .95rem; }
    footer { color: var(--muted); margin-top: 2rem; font-size: .9rem; }
  </style>
</head>
<body>
  <div class="container">
    <header class="hero">
      <h1 class="title">🕒 Basic Employee Shift Manager</h1>
      <p class="subtitle">A simplified web-based tool to help small teams track and manage work shifts.</p>
      <div class="badges">
        <span class="badge">MySQL</span>
        <span class="badge">Auth</span>
        <span class="badge">Schedules</span>
        <span class="badge">Notifications</span>
      </div>
    </header>

    <nav class="toc" aria-label="Table of contents">
      <a href="#features">Features</a>
      <a href="#tech-stack">Tech Stack</a>
      <a href="#getting-started">Installation</a>
      <a href="#usage">Usage</a>
      <a href="#screenshots">Screenshots</a>
      <a href="#contributing">Contributing</a>
      <a href="#license">License</a>
    </nav>

    <section id="features" class="card">
      <h2>✨ Features</h2>
      <ul>
        <li><strong>User Management</strong>: Employees can register and log in.</li>
        <li><strong>Shift Creation</strong>: Admins can assign shifts with start an
