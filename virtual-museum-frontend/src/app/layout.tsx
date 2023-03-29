import NavBar from './(Components)/NavBar'
import './globals.css'
import './(CSS)/Gallery.css'

export const metadata = {
  title: 'Create Next App',
  description: 'Generated by create next app',
}


export default function RootLayout({
  children,
}: {
  children: React.ReactNode
}) {
  return (
    <html lang="en">
      <body>
      <video 
    className='background__video' 
    autoPlay 
    loop 
    muted > 
    <source src='/backgroundmuseum.mp4' />
    </video>
        <header className='global__header'>
          <NavBar />
        </header>
        <main className="global__main">
        {children}
        </main>
        </body>
    </html>
  )
}
